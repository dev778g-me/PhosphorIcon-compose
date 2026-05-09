package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ArrowURightDownFill: ImageVector
    get() {
        if (_ArrowURightDownFill != null) {
            return _ArrowURightDownFill!!
        }
        _ArrowURightDownFill = ImageVector.Builder(
            name = "Filled.ArrowURightDownFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(221.66f, 181.66f)
                lineToRelative(-48f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineToRelative(-48f, -48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 168f)
                horizontalLineToRelative(40f)
                verticalLineTo(88f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -96f, 0f)
                verticalLineToRelative(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(88f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 0f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 13.66f)
                close()
            }
        }.build()

        return _ArrowURightDownFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowURightDownFill: ImageVector? = null
