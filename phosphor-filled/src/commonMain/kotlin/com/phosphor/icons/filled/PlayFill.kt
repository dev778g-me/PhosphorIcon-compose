package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PlayFill: ImageVector
    get() {
        if (_PlayFill != null) {
            return _PlayFill!!
        }
        _PlayFill = ImageVector.Builder(
            name = "Filled.PlayFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 128f)
                arcToRelative(15.74f, 15.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.6f, 13.51f)
                lineTo(88.32f, 229.65f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16.2f, 0.3f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 216.13f)
                verticalLineTo(39.87f)
                arcToRelative(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.12f, -13.82f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.2f, 0.3f)
                lineTo(232.4f, 114.49f)
                arcTo(15.74f, 15.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 128f)
                close()
            }
        }.build()

        return _PlayFill!!
    }

@Suppress("ObjectPropertyName")
private var _PlayFill: ImageVector? = null
