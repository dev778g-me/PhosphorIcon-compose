package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CertificateFill: ImageVector
    get() {
        if (_CertificateFill != null) {
            return _CertificateFill!!
        }
        _CertificateFill = ImageVector.Builder(
            name = "Filled.CertificateFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 86.53f)
                lineTo(232f, 56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                lineTo(24f, 184f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(160f, 200f)
                verticalLineToRelative(24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 172f, 231f)
                lineToRelative(24f, -13.74f)
                lineTo(220f, 231f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 224f)
                lineTo(232f, 161.47f)
                arcToRelative(51.88f, 51.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -74.94f)
                close()
                moveTo(128f, 144f)
                lineTo(72f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(128f, 112f)
                lineTo(72f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(216f, 210.21f)
                lineTo(200f, 201.05f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.94f, 0f)
                lineToRelative(-16f, 9.16f)
                lineTo(176.06f, 172f)
                arcToRelative(51.88f, 51.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 0f)
                close()
                moveTo(196f, 160f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 36f, -36f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 196f, 160f)
                close()
            }
        }.build()

        return _CertificateFill!!
    }

@Suppress("ObjectPropertyName")
private var _CertificateFill: ImageVector? = null
