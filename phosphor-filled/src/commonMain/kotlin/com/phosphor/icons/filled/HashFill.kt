package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HashFill: ImageVector
    get() {
        if (_HashFill != null) {
            return _HashFill!!
        }
        _HashFill = ImageVector.Builder(
            name = "Filled.HashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(116.25f, 112f)
                horizontalLineToRelative(31.5f)
                lineToRelative(-8f, 32f)
                horizontalLineToRelative(-31.5f)
                close()
                moveTo(224f, 48f)
                lineTo(224f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(48f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(32f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 32f)
                lineTo(208f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
                close()
                moveTo(208f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(168.25f, 96f)
                lineToRelative(7.51f, -30.06f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.52f, -3.88f)
                lineTo(151.75f, 96f)
                horizontalLineToRelative(-31.5f)
                lineToRelative(7.51f, -30.06f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.52f, -3.88f)
                lineTo(103.75f, 96f)
                lineTo(64f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(99.75f, 112f)
                lineToRelative(-8f, 32f)
                lineTo(56f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(87.75f, 160f)
                lineToRelative(-7.51f, 30.06f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.82f, 9.7f)
                arcToRelative(8.13f, 8.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0.24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.75f, -6.06f)
                lineTo(104.25f, 160f)
                horizontalLineToRelative(31.5f)
                lineToRelative(-7.51f, 30.06f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.82f, 9.7f)
                arcTo(8.13f, 8.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.75f, -6.06f)
                lineTo(152.25f, 160f)
                lineTo(192f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(156.25f, 144f)
                lineToRelative(8f, -32f)
                lineTo(200f, 112f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 104f)
                close()
            }
        }.build()

        return _HashFill!!
    }

@Suppress("ObjectPropertyName")
private var _HashFill: ImageVector? = null
