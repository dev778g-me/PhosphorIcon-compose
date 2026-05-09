package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SmileySadFill: ImageVector
    get() {
        if (_SmileySadFill != null) {
            return _SmileySadFill!!
        }
        _SmileySadFill = ImageVector.Builder(
            name = "Filled.SmileySadFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(92f, 96f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 96f)
                close()
                moveTo(172f, 182.92f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 161.08f, 180f)
                curveToRelative(-7.47f, -12.91f, -19.21f, -20f, -33.08f, -20f)
                reflectiveCurveToRelative(-25.61f, 7.1f, -33.08f, 20f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -13.84f, -8f)
                curveToRelative(10.29f, -17.79f, 27.39f, -28f, 46.92f, -28f)
                reflectiveCurveToRelative(36.63f, 10.2f, 46.92f, 28f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172f, 182.92f)
                close()
                moveTo(164f, 120f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 164f, 120f)
                close()
            }
        }.build()

        return _SmileySadFill!!
    }

@Suppress("ObjectPropertyName")
private var _SmileySadFill: ImageVector? = null
