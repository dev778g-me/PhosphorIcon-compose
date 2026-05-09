package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HandSoapFill: ImageVector
    get() {
        if (_HandSoapFill != null) {
            return _HandSoapFill!!
        }
        _HandSoapFill = ImageVector.Builder(
            name = "Filled.HandSoapFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(184f, 96.8f)
                verticalLineTo(88f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, -32f)
                horizontalLineTo(136f)
                verticalLineTo(32f)
                horizontalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, -24f)
                horizontalLineTo(104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(16f)
                verticalLineTo(56f)
                horizontalLineTo(104f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 88f)
                verticalLineToRelative(8.8f)
                arcTo(40.07f, 40.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 136f)
                verticalLineToRelative(80f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(136f)
                arcTo(40.07f, 40.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 96.8f)
                close()
                moveTo(104f, 72f)
                horizontalLineToRelative(48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                verticalLineToRelative(8f)
                horizontalLineTo(88f)
                verticalLineTo(88f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 72f)
                close()
            }
        }.build()

        return _HandSoapFill!!
    }

@Suppress("ObjectPropertyName")
private var _HandSoapFill: ImageVector? = null
