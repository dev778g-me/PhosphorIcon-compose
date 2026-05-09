package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.ArrowElbowUpLeft: ImageVector
    get() {
        if (_ArrowElbowUpLeft != null) {
            return _ArrowElbowUpLeft!!
        }
        _ArrowElbowUpLeft = ImageVector.Builder(
            name = "Regular.ArrowElbowUpLeft",
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
                moveTo(192f, 224f)
                lineToRelative(0f, -144f)
                lineToRelative(-144f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 128f)
                lineToRelative(-48f, -48f)
                lineToRelative(48f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 224f)
                lineToRelative(0f, -144f)
                lineToRelative(-144f, 0f)
            }
        }.build()

        return _ArrowElbowUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowUpLeft: ImageVector? = null
