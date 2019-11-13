package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator

class EyesClass : BaseAnimationActivity() {

  override fun onStartAnimation() {
    var elem = 10f
    val positionAnimator = ValueAnimator.ofFloat(elem)

    positionAnimator.addUpdateListener {
      val value = it.animatedValue as Float
      eye1.translationY = value
      eye2.translationY = value
      eye1.translationX = value
      eye2.translationX = value
    }
    val rotationAnimator = ObjectAnimator.ofFloat(eye1, "rotationX",  eye1.translationX - 40f)
    val rotationAnimatora = ObjectAnimator.ofFloat(eye2, "rotationX",  eye2.translationX - 40f)
    val rotationAnimatorb = ObjectAnimator.ofFloat(eye1, "rotationY",  eye1.translationY -  40f)
    val rotationAnimatorac = ObjectAnimator.ofFloat(eye2, "rotationY",  eye2.translationY -  40f)
    val animatorSet = AnimatorSet()
    animatorSet.play(positionAnimator).with(rotationAnimator).with(rotationAnimatora).with(rotationAnimatorb).with(rotationAnimatorac)
//    animatorSet.play(positionAnimator)
//    animatorSet.play(positionAnimator)
//    animatorSet.play(positionAnimator)
    animatorSet.duration = DEFAULT_ANIMATION_DURATION
    animatorSet.start()
  }

}
