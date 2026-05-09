package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CursorFill: ImageVector
    get() {
        if (_CursorFill != null) {
            return _CursorFill!!
        }
        _CursorFill = ImageVector.Builder(
            name = "Filled.CursorFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(220.49f, 207.8f)
                lineTo(207.8f, 220.49f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -17f, 0f)
                lineToRelative(-56.57f, -56.57f)
                lineTo(115f, 214.08f)
                lineToRelative(-0.13f, 0.33f)
                arcTo(15.84f, 15.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100.26f, 224f)
                lineToRelative(-0.78f, 0f)
                arcToRelative(15.82f, 15.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.41f, -11f)
                lineTo(32.8f, 52.92f)
                arcTo(15.95f, 15.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52.92f, 32.8f)
                lineTo(213f, 85.07f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 29.8f)
                lineToRelative(-0.33f, 0.13f)
                lineToRelative(-50.16f, 19.27f)
                lineToRelative(56.57f, 56.56f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 220.49f, 207.8f)
                close()
            }
        }.build()

        return _CursorFill!!
    }

@Suppress("ObjectPropertyName")
private var _CursorFill: ImageVector? = null
