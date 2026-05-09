package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ArrowUDownRightFill: ImageVector
    get() {
        if (_ArrowUDownRightFill != null) {
            return _ArrowUDownRightFill!!
        }
        _ArrowUDownRightFill = ImageVector.Builder(
            name = "Filled.ArrowUDownRightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(229.66f, 173.66f)
                lineToRelative(-48f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 216f)
                verticalLineTo(176f)
                horizontalLineTo(88f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 48f)
                horizontalLineToRelative(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                horizontalLineTo(88f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 96f)
                horizontalLineToRelative(80f)
                verticalLineTo(120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                lineToRelative(48f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 229.66f, 173.66f)
                close()
            }
        }.build()

        return _ArrowUDownRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUDownRightFill: ImageVector? = null
