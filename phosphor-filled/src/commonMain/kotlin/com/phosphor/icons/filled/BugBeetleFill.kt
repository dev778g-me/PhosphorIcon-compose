package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BugBeetleFill: ImageVector
    get() {
        if (_BugBeetleFill != null) {
            return _BugBeetleFill!!
        }
        _BugBeetleFill = ImageVector.Builder(
            name = "Filled.BugBeetleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 120f)
                lineTo(208f, 120f)
                lineTo(208f, 104f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(32f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(48f, 120f)
                lineTo(48f, 104f)
                close()
                moveTo(208f, 160f)
                curveToRelative(0f, 2.7f, -0.14f, 5.37f, -0.4f, 8f)
                lineTo(224f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(204.32f, 184f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -152.64f, 0f)
                lineTo(32f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(48.4f, 168f)
                curveToRelative(-0.26f, -2.63f, -0.4f, -5.3f, -0.4f, -8f)
                verticalLineToRelative(-8f)
                lineTo(32f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(48f, 136f)
                lineTo(48f, 120f)
                lineTo(208f, 120f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(208f, 152f)
                close()
                moveTo(136f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                close()
                moveTo(69.84f, 57.15f)
                arcTo(79.76f, 79.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48.4f, 104f)
                lineTo(207.6f, 104f)
                arcToRelative(79.76f, 79.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21.44f, -46.85f)
                lineToRelative(19.5f, -19.49f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -11.32f)
                lineToRelative(-20.29f, 20.3f)
                arcToRelative(79.74f, 79.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -92.1f, 0f)
                lineTo(61.66f, 26.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 50.34f, 37.66f)
                close()
            }
        }.build()

        return _BugBeetleFill!!
    }

@Suppress("ObjectPropertyName")
private var _BugBeetleFill: ImageVector? = null
