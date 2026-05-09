package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ArrowBendLeftDownFill: ImageVector
    get() {
        if (_ArrowBendLeftDownFill != null) {
            return _ArrowBendLeftDownFill!!
        }
        _ArrowBendLeftDownFill = ImageVector.Builder(
            name = "Filled.ArrowBendLeftDownFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                arcToRelative(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -88f, 88f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 13.66f)
                lineToRelative(-48f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineToRelative(-48f, -48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 168f)
                horizontalLineTo(96f)
                verticalLineTo(128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 32f)
                close()
            }
        }.build()

        return _ArrowBendLeftDownFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendLeftDownFill: ImageVector? = null
