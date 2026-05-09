package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ArrowsOutSimpleBold: ImageVector
    get() {
        if (_ArrowsOutSimpleBold != null) {
            return _ArrowsOutSimpleBold!!
        }
        _ArrowsOutSimpleBold = ImageVector.Builder(
            name = "Bold.ArrowsOutSimpleBold",
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
                moveTo(160f, 48f)
                lineToRelative(48f, 0f)
                lineToRelative(0f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(148f, 108f)
                lineTo(208f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 208f)
                lineToRelative(-48f, 0f)
                lineToRelative(0f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(108f, 148f)
                lineTo(48f, 208f)
            }
        }.build()

        return _ArrowsOutSimpleBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsOutSimpleBold: ImageVector? = null
