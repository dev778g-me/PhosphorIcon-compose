package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.LightningFill: ImageVector
    get() {
        if (_LightningFill != null) {
            return _LightningFill!!
        }
        _LightningFill = ImageVector.Builder(
            name = "Filled.LightningFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.85f, 125.46f)
                lineToRelative(-112f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.69f, -7f)
                lineToRelative(14.66f, -73.33f)
                lineTo(45.19f, 143.49f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -13f)
                lineToRelative(112f, -120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.69f, 7f)
                lineTo(153.18f, 90.9f)
                lineToRelative(57.63f, 21.61f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12.95f)
                close()
            }
        }.build()

        return _LightningFill!!
    }

@Suppress("ObjectPropertyName")
private var _LightningFill: ImageVector? = null
