package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CellSignalXFill: ImageVector
    get() {
        if (_CellSignalXFill != null) {
            return _CellSignalXFill!!
        }
        _CellSignalXFill = ImageVector.Builder(
            name = "Filled.CellSignalXFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.66f, 194.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                lineTo(184f, 187.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineTo(172.69f, 176f)
                lineToRelative(-18.35f, -18.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineTo(184f, 164.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                lineTo(195.31f, 176f)
                close()
                moveTo(157.41f, 120.1f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.92f, 8.05f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.34f, 0f)
                arcToRelative(31.88f, 31.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.77f, -8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.56f, -4f)
                verticalLineTo(40.46f)
                arcToRelative(16.41f, 16.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.18f, -14.93f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18.14f, 3.16f)
                lineToRelative(-160f, 160f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.17f, 18.13f)
                arcTo(16.4f, 16.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32.46f, 216f)
                horizontalLineToRelative(93.6f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.78f, -5.3f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.31f, -32f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5.34f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.26f, -53.23f)
                close()
            }
        }.build()

        return _CellSignalXFill!!
    }

@Suppress("ObjectPropertyName")
private var _CellSignalXFill: ImageVector? = null
