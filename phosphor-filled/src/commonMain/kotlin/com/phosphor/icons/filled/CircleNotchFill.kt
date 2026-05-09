package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CircleNotchFill: ImageVector
    get() {
        if (_CircleNotchFill != null) {
            return _CircleNotchFill!!
        }
        _CircleNotchFill = ImageVector.Builder(
            name = "Filled.CircleNotchFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(128f, 200f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 65.64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 13.85f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = false, 56f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -13.85f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 200f)
                close()
            }
        }.build()

        return _CircleNotchFill!!
    }

@Suppress("ObjectPropertyName")
private var _CircleNotchFill: ImageVector? = null
