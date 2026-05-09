package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ArrowElbowRightUpFill: ImageVector
    get() {
        if (_ArrowElbowRightUpFill != null) {
            return _ArrowElbowRightUpFill!!
        }
        _ArrowElbowRightUpFill = ImageVector.Builder(
            name = "Filled.ArrowElbowRightUpFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(223.39f, 99.06f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 104f)
                horizontalLineTo(176f)
                verticalLineToRelative(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineTo(160f)
                verticalLineTo(104f)
                horizontalLineTo(120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                lineToRelative(48f, -48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(48f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 223.39f, 99.06f)
                close()
            }
        }.build()

        return _ArrowElbowRightUpFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowRightUpFill: ImageVector? = null
