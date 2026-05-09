package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.DownloadFill: ImageVector
    get() {
        if (_DownloadFill != null) {
            return _DownloadFill!!
        }
        _DownloadFill = ImageVector.Builder(
            name = "Filled.DownloadFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(74.34f, 85.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 85.66f, 74.34f)
                lineTo(120f, 108.69f)
                lineTo(120f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(84.69f)
                lineToRelative(34.34f, -34.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                lineToRelative(-48f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                close()
                moveTo(240f, 136f)
                verticalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(32f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(16f, 136f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
                lineTo(84.4f, 120f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, 1.17f)
                lineTo(111f, 145f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 145f, 145f)
                lineToRelative(23.8f, -23.8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 171.6f, 120f)
                lineTo(224f, 120f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 136f)
                close()
                moveTo(200f, 168f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 168f)
                close()
            }
        }.build()

        return _DownloadFill!!
    }

@Suppress("ObjectPropertyName")
private var _DownloadFill: ImageVector? = null
