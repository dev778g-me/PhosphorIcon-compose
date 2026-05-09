package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.ArrowSquareUpLeftLight: ImageVector
    get() {
        if (_ArrowSquareUpLeftLight != null) {
            return _ArrowSquareUpLeftLight!!
        }
        _ArrowSquareUpLeftLight = ImageVector.Builder(
            name = "Light.ArrowSquareUpLeftLight",
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
                moveTo(216f, 48f)
                lineTo(216f, 208f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 216f)
                lineTo(48f, 216f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 208f)
                lineTo(40f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 40f)
                lineTo(208f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 96f)
                lineToRelative(-48f, 0f)
                lineToRelative(0f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 160f)
                lineTo(96f, 96f)
            }
        }.build()

        return _ArrowSquareUpLeftLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSquareUpLeftLight: ImageVector? = null
