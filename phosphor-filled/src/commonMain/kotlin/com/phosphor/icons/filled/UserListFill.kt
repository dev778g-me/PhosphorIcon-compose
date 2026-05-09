package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.UserListFill: ImageVector
    get() {
        if (_UserListFill != null) {
            return _UserListFill!!
        }
        _UserListFill = ImageVector.Builder(
            name = "Filled.UserListFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(152f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(160f, 88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 80f)
                close()
                moveTo(248f, 120f)
                lineTo(160f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(248f, 168f)
                lineTo(184f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(109.29f, 142f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, -58.58f, 0f)
                curveToRelative(-20.62f, 8.73f, -36.87f, 26.3f, -42.46f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 200f)
                lineTo(144f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.75f, -10f)
                curveTo(146.16f, 168.29f, 129.91f, 150.72f, 109.29f, 142f)
                close()
            }
        }.build()

        return _UserListFill!!
    }

@Suppress("ObjectPropertyName")
private var _UserListFill: ImageVector? = null
