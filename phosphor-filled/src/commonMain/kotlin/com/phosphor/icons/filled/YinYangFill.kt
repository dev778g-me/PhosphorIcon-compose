package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.YinYangFill: ImageVector
    get() {
        if (_YinYangFill != null) {
            return _YinYangFill!!
        }
        _YinYangFill = ImageVector.Builder(
            name = "Filled.YinYangFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(140f, 80f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 140f, 80f)
                close()
                moveTo(232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 24f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                close()
                moveTo(140f, 176f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 140f, 176f)
                close()
                moveTo(172f, 84f)
                arcToRelative(44.05f, 44.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -44f, -44f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 81.09f, 202.42f)
                arcTo(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 128f)
                arcTo(44.05f, 44.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 172f, 84f)
                close()
            }
        }.build()

        return _YinYangFill!!
    }

@Suppress("ObjectPropertyName")
private var _YinYangFill: ImageVector? = null
