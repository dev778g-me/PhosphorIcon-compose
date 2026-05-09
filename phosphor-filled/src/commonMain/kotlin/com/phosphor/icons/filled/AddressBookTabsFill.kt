package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.AddressBookTabsFill: ImageVector
    get() {
        if (_AddressBookTabsFill != null) {
            return _AddressBookTabsFill!!
        }
        _AddressBookTabsFill = ImageVector.Builder(
            name = "Filled.AddressBookTabsFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                lineTo(48f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(208f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(224f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(184f, 48f)
                horizontalLineToRelative(24f)
                lineTo(208f, 88f)
                lineTo(184f, 88f)
                close()
                moveTo(184f, 104f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(48f)
                lineTo(184f, 152f)
                close()
                moveTo(146f, 175.75f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.74f, -5.76f)
                curveToRelative(-2.63f, -10.26f, -13.06f, -18f, -24.25f, -18f)
                reflectiveCurveToRelative(-21.61f, 7.74f, -24.25f, 18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.5f, -4f)
                arcToRelative(39.84f, 39.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.19f, -23.34f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 45.12f, 0f)
                arcTo(39.76f, 39.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 151.75f, 166f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 146f, 175.75f)
                close()
                moveTo(208f, 208f)
                lineTo(184f, 208f)
                lineTo(184f, 168f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(40f)
                close()
                moveTo(128f, 120f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 120f)
                close()
            }
        }.build()

        return _AddressBookTabsFill!!
    }

@Suppress("ObjectPropertyName")
private var _AddressBookTabsFill: ImageVector? = null
