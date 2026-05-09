package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.ArrowFatLineLeftThin: ImageVector
    get() {
        if (_ArrowFatLineLeftThin != null) {
            return _ArrowFatLineLeftThin!!
        }
        _ArrowFatLineLeftThin = ImageVector.Builder(
            name = "Thin.ArrowFatLineLeftThin",
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
                moveTo(120f, 32f)
                lineToRelative(-96f, 96f)
                lineToRelative(96f, 96f)
                lineToRelative(0f, -48f)
                lineToRelative(64f, 0f)
                lineToRelative(0f, -96f)
                lineToRelative(-64f, 0f)
                lineToRelative(0f, -48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 176f)
                lineTo(216f, 80f)
            }
        }.build()

        return _ArrowFatLineLeftThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLineLeftThin: ImageVector? = null
