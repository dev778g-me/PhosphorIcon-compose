package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.FlaskDuotone: ImageVector
    get() {
        if (_FlaskDuotone != null) {
            return _FlaskDuotone!!
        }
        _FlaskDuotone = ImageVector.Builder(
            name = "Duotone.FlaskDuotone",
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
                moveTo(71.63f, 153.08f)
                curveToRelative(13.23f, -2.48f, 32f, -1.41f, 56.37f, 10.92f)
                curveToRelative(32.25f, 16.33f, 54.75f, 12.91f, 67.5f, 7.65f)
                horizontalLineToRelative(0f)
                lineToRelative(19.34f, 32.23f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 216f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.86f, -12.12f)
                lineToRelative(30.48f, -50.8f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 32f)
                lineTo(168f, 32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 32f)
                verticalLineTo(99.14f)
                lineToRelative(62.85f, 104.74f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 216f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.86f, -12.12f)
                lineTo(104f, 99.14f)
                verticalLineTo(32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(71.63f, 153.08f)
                curveToRelative(13.23f, -2.48f, 32f, -1.41f, 56.37f, 10.92f)
                curveToRelative(32.25f, 16.33f, 54.75f, 12.91f, 67.5f, 7.65f)
            }
        }.build()

        return _FlaskDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskDuotone: ImageVector? = null
