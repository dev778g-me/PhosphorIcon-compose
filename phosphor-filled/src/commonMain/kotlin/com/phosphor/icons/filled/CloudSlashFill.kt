package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CloudSlashFill: ImageVector
    get() {
        if (_CloudSlashFill != null) {
            return _CloudSlashFill!!
        }
        _CloudSlashFill = ImageVector.Builder(
            name = "Filled.CloudSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 128.72f)
                arcTo(87.74f, 87.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 222.41f, 190f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.77f, -0.16f)
                lineTo(103.78f, 65.67f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.39f, -5.76f)
                arcTo(87.82f, 87.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160.87f, 40f)
                curveTo(209.15f, 40.47f, 248.38f, 80.43f, 248f, 128.72f)
                close()
                moveTo(53.92f, 34.62f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 42.08f, 45.38f)
                lineTo(81.33f, 88.56f)
                lineToRelative(-0.06f, 0.11f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 153f)
                curveToRelative(0.53f, 35.12f, 29.84f, 63f, 65f, 63f)
                horizontalLineToRelative(87f)
                arcToRelative(87.65f, 87.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 31.78f, -5.95f)
                lineToRelative(10.3f, 11.33f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.33f, 0.52f)
                arcToRelative(8.32f, 8.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, -11.52f)
                close()
            }
        }.build()

        return _CloudSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSlashFill: ImageVector? = null
