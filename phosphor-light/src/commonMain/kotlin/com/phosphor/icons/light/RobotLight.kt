package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.RobotLight: ImageVector
    get() {
        if (_RobotLight != null) {
            return _RobotLight!!
        }
        _RobotLight = ImageVector.Builder(
            name = "Light.RobotLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 56f)
                lineTo(200f, 56f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 80f)
                lineTo(224f, 192f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 216f)
                lineTo(56f, 216f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 192f)
                lineTo(32f, 80f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 56f)
                lineTo(128f, 16f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(84f, 108f)
                moveToRelative(-10f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(172f, 108f)
                moveToRelative(-10f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(92f, 144f)
                lineTo(164f, 144f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 164f)
                lineTo(184f, 164f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 164f, 184f)
                lineTo(92f, 184f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 164f)
                lineTo(72f, 164f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 144f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(148f, 144f)
                lineTo(148f, 184f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(108f, 144f)
                lineTo(108f, 184f)
            }
        }.build()

        return _RobotLight!!
    }

@Suppress("ObjectPropertyName")
private var _RobotLight: ImageVector? = null
