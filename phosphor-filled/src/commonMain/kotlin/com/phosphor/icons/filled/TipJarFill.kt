package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TipJarFill: ImageVector
    get() {
        if (_TipJarFill != null) {
            return _TipJarFill!!
        }
        _TipJarFill = ImageVector.Builder(
            name = "Filled.TipJarFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(184f, 48.81f)
                lineTo(184f, 32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(88f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 32f)
                lineTo(72f, 48.81f)
                arcTo(40.05f, 40.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 88f)
                lineTo(40f, 200f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                horizontalLineToRelative(96f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, -40f)
                lineTo(216f, 88f)
                arcTo(40.05f, 40.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 48.81f)
                close()
                moveTo(120f, 32f)
                horizontalLineToRelative(16f)
                lineTo(136f, 48f)
                lineTo(120f, 48f)
                close()
                moveTo(88f, 32f)
                horizontalLineToRelative(16f)
                lineTo(104f, 48f)
                lineTo(88f, 48f)
                close()
                moveTo(136f, 184f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(120f, 152f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -48f)
                lineTo(120f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(120f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(16f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 48f)
                close()
                moveTo(168f, 48f)
                lineTo(152f, 48f)
                lineTo(152f, 32f)
                horizontalLineToRelative(16f)
                close()
            }
        }.build()

        return _TipJarFill!!
    }

@Suppress("ObjectPropertyName")
private var _TipJarFill: ImageVector? = null
