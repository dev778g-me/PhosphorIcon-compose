package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TrayArrowDownFill: ImageVector
    get() {
        if (_TrayArrowDownFill != null) {
            return _TrayArrowDownFill!!
        }
        _TrayArrowDownFill = ImageVector.Builder(
            name = "Filled.TrayArrowDownFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                horizontalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(90.34f, 114.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineTo(120f, 132.69f)
                verticalLineTo(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(60.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                lineToRelative(-32f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineToRelative(-32f, -32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 90.34f, 114.34f)
                close()
                moveTo(208f, 208f)
                horizontalLineTo(48f)
                verticalLineTo(168f)
                horizontalLineTo(76.69f)
                lineTo(96f, 187.32f)
                arcTo(15.89f, 15.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 107.31f, 192f)
                horizontalLineToRelative(41.38f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 187.31f)
                lineTo(179.31f, 168f)
                horizontalLineTo(208f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()

        return _TrayArrowDownFill!!
    }

@Suppress("ObjectPropertyName")
private var _TrayArrowDownFill: ImageVector? = null
