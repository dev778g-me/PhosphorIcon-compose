package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.StarFill: ImageVector
    get() {
        if (_StarFill != null) {
            return _StarFill!!
        }
        _StarFill = ImageVector.Builder(
            name = "Filled.StarFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(234.29f, 114.85f)
                lineToRelative(-45f, 38.83f)
                lineTo(203f, 211.75f)
                arcToRelative(16.4f, 16.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24.5f, 17.82f)
                lineTo(128f, 198.49f)
                lineTo(77.47f, 229.57f)
                arcTo(16.4f, 16.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 53f, 211.75f)
                lineToRelative(13.76f, -58.07f)
                lineToRelative(-45f, -38.83f)
                arcTo(16.46f, 16.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 31.08f, 86f)
                lineToRelative(59f, -4.76f)
                lineToRelative(22.76f, -55.08f)
                arcToRelative(16.36f, 16.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 30.27f, 0f)
                lineToRelative(22.75f, 55.08f)
                lineToRelative(59f, 4.76f)
                arcToRelative(16.46f, 16.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.37f, 28.86f)
                close()
            }
        }.build()

        return _StarFill!!
    }

@Suppress("ObjectPropertyName")
private var _StarFill: ImageVector? = null
