package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PaintBrushHouseholdFill: ImageVector
    get() {
        if (_PaintBrushHouseholdFill != null) {
            return _PaintBrushHouseholdFill!!
        }
        _PaintBrushHouseholdFill = ImageVector.Builder(
            name = "Filled.PaintBrushHouseholdFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(230.64f, 25.36f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -45.26f, 0f)
                quadToRelative(-0.21f, 0.21f, -0.42f, 0.45f)
                lineTo(131.55f, 88.22f)
                lineTo(121f, 77.64f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -33.95f, 0f)
                lineToRelative(-76.69f, 76.7f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.31f)
                lineToRelative(80f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.31f, 0f)
                lineTo(178.36f, 169f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -33.95f)
                lineToRelative(-10.58f, -10.57f)
                lineTo(230.19f, 71f)
                curveToRelative(0.15f, -0.14f, 0.31f, -0.28f, 0.45f, -0.43f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 230.64f, 25.36f)
                close()
                moveTo(96f, 228.69f)
                lineTo(79.32f, 212f)
                lineToRelative(22.34f, -22.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.31f, -11.31f)
                lineTo(68f, 200.68f)
                lineTo(55.32f, 188f)
                lineToRelative(22.34f, -22.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.31f, -11.31f)
                lineTo(44f, 176.68f)
                lineTo(27.31f, 160f)
                lineToRelative(50.35f, -50.34f)
                lineToRelative(68.69f, 68.69f)
                close()
            }
        }.build()

        return _PaintBrushHouseholdFill!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBrushHouseholdFill: ImageVector? = null
