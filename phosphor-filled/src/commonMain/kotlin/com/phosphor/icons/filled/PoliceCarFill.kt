package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PoliceCarFill: ImageVector
    get() {
        if (_PoliceCarFill != null) {
            return _PoliceCarFill!!
        }
        _PoliceCarFill = ImageVector.Builder(
            name = "Filled.PoliceCarFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(96f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(104f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 24f)
                close()
                moveTo(248f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(80f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(192f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineToRelative(-8f)
                lineTo(80f, 192f)
                verticalLineToRelative(8f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(40f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(24f, 120f)
                lineTo(16f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(27.36f, 104f)
                lineTo(54.75f, 56.06f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68.64f, 48f)
                lineTo(187.36f, 48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.89f, 8.06f)
                lineTo(228.64f, 104f)
                lineTo(240f, 104f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 112f)
                close()
                moveTo(88f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(56f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(80f, 152f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 144f)
                close()
                moveTo(208f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(176f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 144f)
                close()
                moveTo(210.21f, 104f)
                lineTo(187.36f, 64f)
                lineTo(68.64f, 64f)
                lineTo(45.79f, 104f)
                close()
            }
        }.build()

        return _PoliceCarFill!!
    }

@Suppress("ObjectPropertyName")
private var _PoliceCarFill: ImageVector? = null
