package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SignInFill: ImageVector
    get() {
        if (_SignInFill != null) {
            return _SignInFill!!
        }
        _SignInFill = ImageVector.Builder(
            name = "Filled.SignInFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(141.66f, 133.66f)
                lineToRelative(-40f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 168f)
                verticalLineTo(136f)
                horizontalLineTo(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineTo(88f)
                verticalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                lineToRelative(40f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 141.66f, 133.66f)
                close()
                moveTo(200f, 32f)
                horizontalLineTo(136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(56f)
                verticalLineTo(208f)
                horizontalLineTo(136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 32f)
                close()
            }
        }.build()

        return _SignInFill!!
    }

@Suppress("ObjectPropertyName")
private var _SignInFill: ImageVector? = null
