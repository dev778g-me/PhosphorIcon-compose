package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.CloudFogBold: ImageVector
    get() {
        if (_CloudFogBold != null) {
            return _CloudFogBold!!
        }
        _CloudFogBold = ImageVector.Builder(
            name = "Bold.CloudFogBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 196f)
                lineTo(72f, 196f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 196f)
                lineTo(160f, 196f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 232f)
                lineTo(104f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(92f, 96f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 64f)
                horizontalLineTo(76f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 93.15f, 83.85f)
            }
        }.build()

        return _CloudFogBold!!
    }

@Suppress("ObjectPropertyName")
private var _CloudFogBold: ImageVector? = null
