package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.ArrowElbowLeftThin: ImageVector
    get() {
        if (_ArrowElbowLeftThin != null) {
            return _ArrowElbowLeftThin!!
        }
        _ArrowElbowLeftThin = ImageVector.Builder(
            name = "Thin.ArrowElbowLeftThin",
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
                moveTo(96f, 80f)
                lineToRelative(-72f, 0f)
                lineToRelative(0f, 72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 96f)
                lineToRelative(-96f, 96f)
                lineToRelative(-112f, -112f)
            }
        }.build()

        return _ArrowElbowLeftThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowLeftThin: ImageVector? = null
