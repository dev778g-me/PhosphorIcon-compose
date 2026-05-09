package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.ArrowElbowUpLeftThin: ImageVector
    get() {
        if (_ArrowElbowUpLeftThin != null) {
            return _ArrowElbowUpLeftThin!!
        }
        _ArrowElbowUpLeftThin = ImageVector.Builder(
            name = "Thin.ArrowElbowUpLeftThin",
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
                moveTo(96f, 128f)
                lineToRelative(-48f, -48f)
                lineToRelative(48f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 224f)
                lineToRelative(0f, -144f)
                lineToRelative(-144f, 0f)
            }
        }.build()

        return _ArrowElbowUpLeftThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowUpLeftThin: ImageVector? = null
