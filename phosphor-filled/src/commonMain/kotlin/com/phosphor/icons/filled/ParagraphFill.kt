package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ParagraphFill: ImageVector
    get() {
        if (_ParagraphFill != null) {
            return _ParagraphFill!!
        }
        _ParagraphFill = ImageVector.Builder(
            name = "Filled.ParagraphFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(192f)
                verticalLineTo(208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(56f)
                horizontalLineTo(152f)
                verticalLineTo(208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(168f)
                horizontalLineTo(96f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 40f)
                horizontalLineTo(208f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 48f)
                close()
            }
        }.build()

        return _ParagraphFill!!
    }

@Suppress("ObjectPropertyName")
private var _ParagraphFill: ImageVector? = null
