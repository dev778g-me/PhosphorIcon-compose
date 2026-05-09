package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.ArrowFatLineDownThin: ImageVector
    get() {
        if (_ArrowFatLineDownThin != null) {
            return _ArrowFatLineDownThin!!
        }
        _ArrowFatLineDownThin = ImageVector.Builder(
            name = "Thin.ArrowFatLineDownThin",
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
                moveTo(32f, 136f)
                lineToRelative(96f, 96f)
                lineToRelative(96f, -96f)
                lineToRelative(-48f, 0f)
                lineToRelative(0f, -64f)
                lineToRelative(-96f, 0f)
                lineToRelative(0f, 64f)
                lineToRelative(-48f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 40f)
                lineTo(80f, 40f)
            }
        }.build()

        return _ArrowFatLineDownThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLineDownThin: ImageVector? = null
