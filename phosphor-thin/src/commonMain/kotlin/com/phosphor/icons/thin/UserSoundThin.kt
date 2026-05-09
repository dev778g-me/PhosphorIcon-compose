package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.UserSoundThin: ImageVector
    get() {
        if (_UserSoundThin != null) {
            return _UserSoundThin!!
        }
        _UserSoundThin = ImageVector.Builder(
            name = "Thin.UserSoundThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
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
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 208f)
                curveToRelative(20.55f, -24.45f, 49.56f, -40f, 84f, -40f)
                reflectiveCurveToRelative(63.45f, 15.55f, 84f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 68.74f)
                arcToRelative(100.33f, 100.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 78.52f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(229.36f, 56f)
                arcToRelative(132.39f, 132.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 104f)
            }
        }.build()

        return _UserSoundThin!!
    }

@Suppress("ObjectPropertyName")
private var _UserSoundThin: ImageVector? = null
