package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TaxiFill: ImageVector
    get() {
        if (_TaxiFill != null) {
            return _TaxiFill!!
        }
        _TaxiFill = ImageVector.Builder(
            name = "Filled.TaxiFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 104f)
                lineTo(228.64f, 104f)
                lineTo(201.25f, 56.06f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 187.36f, 48f)
                lineTo(165.42f, 48f)
                lineToRelative(-12f, -29.94f)
                arcTo(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 138.58f, 8f)
                lineTo(117.42f, 8f)
                arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.86f, 10.06f)
                lineTo(90.58f, 48f)
                lineTo(68.64f, 48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.89f, 8.06f)
                lineTo(27.36f, 104f)
                lineTo(16f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(80f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(64f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(8f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(24f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 120f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(80f, 152f)
                lineTo(56f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(80f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(200f, 152f)
                lineTo(176f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(45.79f, 104f)
                lineTo(68.64f, 64f)
                lineTo(187.36f, 64f)
                lineToRelative(22.85f, 40f)
                close()
            }
        }.build()

        return _TaxiFill!!
    }

@Suppress("ObjectPropertyName")
private var _TaxiFill: ImageVector? = null
