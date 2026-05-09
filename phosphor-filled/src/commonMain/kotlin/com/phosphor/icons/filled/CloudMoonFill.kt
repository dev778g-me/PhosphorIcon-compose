package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CloudMoonFill: ImageVector
    get() {
        if (_CloudMoonFill != null) {
            return _CloudMoonFill!!
        }
        _CloudMoonFill = ImageVector.Builder(
            name = "Filled.CloudMoonFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(172f, 72f)
                arcToRelative(76.35f, 76.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.36f, 1f)
                arcTo(71.93f, 71.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104.17f, 9.83f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.59f, 9.58f)
                arcTo(56.05f, 56.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 88f)
                arcToRelative(56.45f, 56.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.59f, -1.42f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.59f, 9.59f)
                arcToRelative(72.22f, 72.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32.29f, 45.06f)
                arcTo(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92f, 224f)
                horizontalLineToRelative(80f)
                arcToRelative(76f, 76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -152f)
                close()
                moveTo(37.37f, 104f)
                curveToRelative(0.87f, 0f, 1.75f, 0f, 2.63f, 0f)
                arcToRelative(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, -72f)
                curveToRelative(0f, -0.89f, 0f, -1.78f, 0f, -2.67f)
                arcToRelative(55.64f, 55.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 48.05f)
                arcTo(76.4f, 76.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 101f, 120.78f)
                arcToRelative(52.38f, 52.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, -0.78f)
                arcToRelative(51.69f, 51.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, -30f, 9.59f)
                arcTo(56.22f, 56.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 37.37f, 104f)
                close()
            }
        }.build()

        return _CloudMoonFill!!
    }

@Suppress("ObjectPropertyName")
private var _CloudMoonFill: ImageVector? = null
