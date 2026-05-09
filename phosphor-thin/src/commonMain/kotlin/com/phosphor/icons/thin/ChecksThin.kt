package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.ChecksThin: ImageVector
    get() {
        if (_ChecksThin != null) {
            return _ChecksThin!!
        }
        _ChecksThin = ImageVector.Builder(
            name = "Thin.ChecksThin",
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
                moveTo(16f, 130.29f)
                lineToRelative(38.4f, 37.71f)
                lineToRelative(89.6f, -88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(125.96f, 144f)
                lineToRelative(24.44f, 24f)
                lineToRelative(89.6f, -88f)
            }
        }.build()

        return _ChecksThin!!
    }

@Suppress("ObjectPropertyName")
private var _ChecksThin: ImageVector? = null
