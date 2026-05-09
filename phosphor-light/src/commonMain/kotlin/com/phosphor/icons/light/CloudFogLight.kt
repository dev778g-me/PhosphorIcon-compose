package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.CloudFogLight: ImageVector
    get() {
        if (_CloudFogLight != null) {
            return _CloudFogLight!!
        }
        _CloudFogLight = ImageVector.Builder(
            name = "Light.CloudFogLight",
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
                moveTo(120f, 200f)
                lineTo(72f, 200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 200f)
                lineTo(160f, 200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 232f)
                lineTo(104f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 96f)
                arcToRelative(68.06f, 68.06f, 0f, isMoreThanHalf = true, isPositiveArc = true, 68f, 72f)
                horizontalLineTo(76f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, 90.2f, 82.34f)
            }
        }.build()

        return _CloudFogLight!!
    }

@Suppress("ObjectPropertyName")
private var _CloudFogLight: ImageVector? = null
