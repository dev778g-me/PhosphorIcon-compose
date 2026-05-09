package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GraduationCapFill: ImageVector
    get() {
        if (_GraduationCapFill != null) {
            return _GraduationCapFill!!
        }
        _GraduationCapFill = ImageVector.Builder(
            name = "Filled.GraduationCapFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(176f, 207.24f)
                arcToRelative(119f, 119f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -7.73f)
                lineTo(192f, 240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(187.76f, 118.81f)
                lineTo(131.76f, 88.94f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.52f, 14.12f)
                lineTo(171f, 128f)
                lineToRelative(17f, -9.06f)
                close()
                moveTo(251.76f, 88.94f)
                lineTo(131.76f, 24.94f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.52f, 0f)
                lineToRelative(-120f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14.12f)
                lineTo(32f, 117.87f)
                verticalLineToRelative(48.42f)
                arcToRelative(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.06f, 10.65f)
                curveTo(49.16f, 191.53f, 78.51f, 216f, 128f, 216f)
                arcToRelative(130f, 130f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, -8.76f)
                lineTo(176f, 130.67f)
                lineTo(171f, 128f)
                lineToRelative(-43f, 22.93f)
                lineTo(43.83f, 106f)
                lineToRelative(0f, 0f)
                lineTo(25f, 96f)
                lineTo(128f, 41.07f)
                lineTo(231f, 96f)
                lineToRelative(-18.78f, 10f)
                lineToRelative(-0.06f, 0f)
                lineTo(188f, 118.94f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 6.93f)
                verticalLineToRelative(73.64f)
                arcToRelative(115.63f, 115.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 27.94f, -22.57f)
                arcTo(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 166.29f)
                lineTo(224f, 117.87f)
                lineToRelative(27.76f, -14.81f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -14.12f)
                close()
            }
        }.build()

        return _GraduationCapFill!!
    }

@Suppress("ObjectPropertyName")
private var _GraduationCapFill: ImageVector? = null
