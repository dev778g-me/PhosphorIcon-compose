package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.StudentFill: ImageVector
    get() {
        if (_StudentFill != null) {
            return _StudentFill!!
        }
        _StudentFill = ImageVector.Builder(
            name = "Filled.StudentFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(226.53f, 56.41f)
                lineToRelative(-96f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.06f, 0f)
                lineToRelative(-96f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 64f)
                verticalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(75.1f)
                lineTo(73.59f, 86.29f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.65f, 88.05f)
                curveToRelative(-18f, 7.06f, -33.56f, 19.83f, -44.94f, 37.29f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13.4f, 8.74f)
                curveTo(77.77f, 197.25f, 101.57f, 184f, 128f, 184f)
                reflectiveCurveToRelative(50.23f, 13.25f, 65.3f, 36.37f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.4f, -8.74f)
                curveToRelative(-11.38f, -17.46f, -27f, -30.23f, -44.94f, -37.29f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.65f, -88f)
                lineToRelative(44.12f, -14.7f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -15.18f)
                close()
                moveTo(176f, 120f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 89.35f, 91.55f)
                lineToRelative(36.12f, 12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.06f, 0f)
                lineToRelative(36.12f, -12f)
                arcTo(47.89f, 47.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 120f)
                close()
            }
        }.build()

        return _StudentFill!!
    }

@Suppress("ObjectPropertyName")
private var _StudentFill: ImageVector? = null
