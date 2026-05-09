package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.UserSoundDuotone: ImageVector
    get() {
        if (_UserSoundDuotone != null) {
            return _UserSoundDuotone!!
        }
        _UserSoundDuotone = ImageVector.Builder(
            name = "Duotone.UserSoundDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(108f, 108f)
                moveToRelative(-60f, 0f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, 120f, 0f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, -120f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(108f, 108f)
                moveToRelative(-60f, 0f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, 120f, 0f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, -120f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 208f)
                curveToRelative(20.55f, -24.45f, 49.56f, -40f, 84f, -40f)
                reflectiveCurveToRelative(63.45f, 15.55f, 84f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 68.74f)
                arcToRelative(100.33f, 100.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 78.52f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(229.36f, 56f)
                arcToRelative(132.39f, 132.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 104f)
            }
        }.build()

        return _UserSoundDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _UserSoundDuotone: ImageVector? = null
