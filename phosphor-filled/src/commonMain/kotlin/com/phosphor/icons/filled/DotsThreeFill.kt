package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.DotsThreeFill: ImageVector
    get() {
        if (_DotsThreeFill != null) {
            return _DotsThreeFill!!
        }
        _DotsThreeFill = ImageVector.Builder(
            name = "Filled.DotsThreeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 80f)
                lineTo(32f, 80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 96f)
                verticalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(224f, 176f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(240f, 96f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 80f)
                close()
                moveTo(60f, 140f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 60f, 140f)
                close()
                moveTo(128f, 140f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 140f)
                close()
                moveTo(196f, 140f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 196f, 140f)
                close()
            }
        }.build()

        return _DotsThreeFill!!
    }

@Suppress("ObjectPropertyName")
private var _DotsThreeFill: ImageVector? = null
