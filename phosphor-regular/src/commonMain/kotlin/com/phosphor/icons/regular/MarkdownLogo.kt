package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.MarkdownLogo: ImageVector
    get() {
        if (_MarkdownLogo != null) {
            return _MarkdownLogo!!
        }
        _MarkdownLogo = ImageVector.Builder(
            name = "Regular.MarkdownLogo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 56f)
                lineTo(232f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 64f)
                lineTo(240f, 192f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 200f)
                lineTo(24f, 200f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 192f)
                lineTo(16f, 64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 152f)
                lineToRelative(0f, -48f)
                lineToRelative(32f, 32f)
                lineToRelative(32f, -32f)
                lineToRelative(0f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 104f)
                lineTo(176f, 152f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 128f)
                lineToRelative(-24f, 24f)
                lineToRelative(-24f, -24f)
            }
        }.build()

        return _MarkdownLogo!!
    }

@Suppress("ObjectPropertyName")
private var _MarkdownLogo: ImageVector? = null
