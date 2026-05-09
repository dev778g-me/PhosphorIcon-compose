package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ToiletPaperFill: ImageVector
    get() {
        if (_ToiletPaperFill != null) {
            return _ToiletPaperFill!!
        }
        _ToiletPaperFill = ImageVector.Builder(
            name = "Filled.ToiletPaperFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(184f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(160f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 120f)
                close()
                moveTo(240f, 120f)
                verticalLineToRelative(88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(112f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(96f, 186.35f)
                curveTo(87.37f, 200.37f, 76.18f, 208f, 64f, 208f)
                curveToRelative(-13.87f, 0f, -26.46f, -9.89f, -35.44f, -27.85f)
                curveTo(20.46f, 164f, 16f, 142.59f, 16f, 120f)
                reflectiveCurveToRelative(4.46f, -43.95f, 12.56f, -60.15f)
                curveTo(37.54f, 41.89f, 50.13f, 32f, 64f, 32f)
                lineTo(192f, 32f)
                curveToRelative(13.87f, 0f, 26.46f, 9.89f, 35.44f, 27.85f)
                curveTo(235.54f, 76.05f, 240f, 97.41f, 240f, 120f)
                close()
                moveTo(76f, 120f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 76f, 120f)
                close()
                moveTo(224f, 128f)
                lineTo(208f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(15.79f)
                curveTo(221.84f, 73.9f, 206.16f, 48f, 192f, 48f)
                lineTo(92.12f, 48f)
                arcToRelative(73.6f, 73.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.32f, 11.85f)
                curveToRelative(7.14f, 14.28f, 11.44f, 32.56f, 12.37f, 52.15f)
                lineTo(128f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(112f, 128f)
                verticalLineToRelative(80f)
                lineTo(224f, 208f)
                close()
            }
        }.build()

        return _ToiletPaperFill!!
    }

@Suppress("ObjectPropertyName")
private var _ToiletPaperFill: ImageVector? = null
