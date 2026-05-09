package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ArrowBendLeftUpFill: ImageVector
    get() {
        if (_ArrowBendLeftUpFill != null) {
            return _ArrowBendLeftUpFill!!
        }
        _ArrowBendLeftUpFill = ImageVector.Builder(
            name = "Filled.ArrowBendLeftUpFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 128f)
                verticalLineTo(88f)
                horizontalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                lineToRelative(48f, -48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(48f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 88f)
                horizontalLineTo(112f)
                verticalLineToRelative(40f)
                arcToRelative(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 224f)
                close()
            }
        }.build()

        return _ArrowBendLeftUpFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendLeftUpFill: ImageVector? = null
