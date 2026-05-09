package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.CloudSunDuotone: ImageVector
    get() {
        if (_CloudSunDuotone != null) {
            return _CloudSunDuotone!!
        }
        _CloudSunDuotone = ImageVector.Builder(
            name = "Duotone.CloudSunDuotone",
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
                moveTo(59.66f, 135.35f)
                arcToRelative(44.08f, 44.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 38.54f, -5f)
                verticalLineToRelative(0.11f)
                arcToRelative(68.22f, 68.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 41.65f, -46f)
                verticalLineToRelative(0f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, -80.19f, 50.94f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(87.66f, 56.73f)
                lineTo(83.5f, 33.09f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56.69f, 76.46f)
                lineTo(37.03f, 62.69f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48.73f, 112.31f)
                lineTo(25.09f, 116.48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(123.52f, 64.69f)
                lineTo(137.28f, 45.03f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 144f)
                arcToRelative(68.06f, 68.06f, 0f, isMoreThanHalf = true, isPositiveArc = true, 68f, 72f)
                horizontalLineTo(84f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.2f, -85.66f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(59.65f, 135.35f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80.19f, -50.94f)
            }
        }.build()

        return _CloudSunDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSunDuotone: ImageVector? = null
