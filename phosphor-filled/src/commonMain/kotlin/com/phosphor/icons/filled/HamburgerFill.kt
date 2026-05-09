package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HamburgerFill: ImageVector
    get() {
        if (_HamburgerFill != null) {
            return _HamburgerFill!!
        }
        _HamburgerFill = ImageVector.Builder(
            name = "Filled.HamburgerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(35.58f, 98.06f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.23f, -13.44f)
                curveTo(39.78f, 49.5f, 80f, 24f, 128f, 24f)
                reflectiveCurveToRelative(88.22f, 25.5f, 95.65f, 60.62f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 207.93f, 104f)
                lineTo(48.07f, 104f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 35.58f, 98.06f)
                close()
                moveTo(229.26f, 152.48f)
                lineTo(188.13f, 167.48f)
                lineTo(151f, 152.57f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.94f, 0f)
                lineToRelative(-37f, 14.81f)
                lineTo(71f, 152.57f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.7f, -0.09f)
                lineToRelative(-44f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.47f, 15f)
                lineTo(40f, 178.69f)
                lineTo(40f, 184f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                horizontalLineToRelative(96f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, -40f)
                verticalLineToRelative(-9.67f)
                lineToRelative(18.73f, -6.81f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.47f, -15f)
                close()
                moveTo(24f, 136f)
                lineTo(232f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(24f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                close()
            }
        }.build()

        return _HamburgerFill!!
    }

@Suppress("ObjectPropertyName")
private var _HamburgerFill: ImageVector? = null
