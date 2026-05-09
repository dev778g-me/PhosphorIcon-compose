package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.ArrowFatLinesUpThin: ImageVector
    get() {
        if (_ArrowFatLinesUpThin != null) {
            return _ArrowFatLinesUpThin!!
        }
        _ArrowFatLinesUpThin = ImageVector.Builder(
            name = "Thin.ArrowFatLinesUpThin",
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
                moveTo(32f, 120f)
                lineToRelative(96f, -96f)
                lineToRelative(96f, 96f)
                lineToRelative(-48f, 0f)
                lineToRelative(0f, 32f)
                lineToRelative(-96f, 0f)
                lineToRelative(0f, -32f)
                lineToRelative(-48f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 216f)
                lineTo(80f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 184f)
                lineTo(80f, 184f)
            }
        }.build()

        return _ArrowFatLinesUpThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLinesUpThin: ImageVector? = null
