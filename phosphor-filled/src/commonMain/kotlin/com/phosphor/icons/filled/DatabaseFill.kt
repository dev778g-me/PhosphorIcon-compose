package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.DatabaseFill: ImageVector
    get() {
        if (_DatabaseFill != null) {
            return _DatabaseFill!!
        }
        _DatabaseFill = ImageVector.Builder(
            name = "Filled.DatabaseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                curveTo(74.17f, 24f, 32f, 48.6f, 32f, 80f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 31.4f, 42.17f, 56f, 96f, 56f)
                reflectiveCurveToRelative(96f, -24.6f, 96f, -56f)
                lineTo(224f, 80f)
                curveTo(224f, 48.6f, 181.83f, 24f, 128f, 24f)
                close()
                moveTo(208f, 128f)
                curveToRelative(0f, 9.62f, -7.88f, 19.43f, -21.61f, 26.92f)
                curveTo(170.93f, 163.35f, 150.19f, 168f, 128f, 168f)
                reflectiveCurveToRelative(-42.93f, -4.65f, -58.39f, -13.08f)
                curveTo(55.88f, 147.43f, 48f, 137.62f, 48f, 128f)
                lineTo(48f, 111.36f)
                curveToRelative(17.06f, 15f, 46.23f, 24.64f, 80f, 24.64f)
                reflectiveCurveToRelative(62.94f, -9.68f, 80f, -24.64f)
                close()
                moveTo(186.39f, 202.92f)
                curveTo(170.93f, 211.35f, 150.19f, 216f, 128f, 216f)
                reflectiveCurveToRelative(-42.93f, -4.65f, -58.39f, -13.08f)
                curveTo(55.88f, 195.43f, 48f, 185.62f, 48f, 176f)
                lineTo(48f, 159.36f)
                curveToRelative(17.06f, 15f, 46.23f, 24.64f, 80f, 24.64f)
                reflectiveCurveToRelative(62.94f, -9.68f, 80f, -24.64f)
                lineTo(208f, 176f)
                curveTo(208f, 185.62f, 200.12f, 195.43f, 186.39f, 202.92f)
                close()
            }
        }.build()

        return _DatabaseFill!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseFill: ImageVector? = null
