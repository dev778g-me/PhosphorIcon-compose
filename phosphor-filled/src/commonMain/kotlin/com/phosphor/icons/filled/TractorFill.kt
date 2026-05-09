package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TractorFill: ImageVector
    get() {
        if (_TractorFill != null) {
            return _TractorFill!!
        }
        _TractorFill = ImageVector.Builder(
            name = "Filled.TractorFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(80f, 172f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 172f)
                close()
                moveTo(120f, 172f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, -52f, -52f)
                arcTo(52.06f, 52.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 172f)
                close()
                moveTo(96f, 172f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, -28f, 28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 172f)
                close()
                moveTo(248f, 188f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -71.77f, 4f)
                lineTo(144f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                lineTo(136f, 172f)
                arcToRelative(68.07f, 68.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -68f, -68f)
                lineTo(40f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(8f)
                lineTo(48f, 56f)
                lineTo(40f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(160f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                horizontalLineToRelative(-8f)
                lineTo(152f, 97.88f)
                lineToRelative(24f, 6.5f)
                lineTo(176f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(36.71f)
                lineToRelative(36.39f, 9.86f)
                lineToRelative(0.21f, 0.06f)
                arcTo(15.89f, 15.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 134f)
                verticalLineToRelative(31.46f)
                arcTo(35.8f, 35.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 188f)
                close()
                moveTo(228f, 188f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, -16f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 228f, 188f)
                close()
            }
        }.build()

        return _TractorFill!!
    }

@Suppress("ObjectPropertyName")
private var _TractorFill: ImageVector? = null
